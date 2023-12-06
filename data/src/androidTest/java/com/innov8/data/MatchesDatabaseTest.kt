package com.innov8.data

import android.content.Context
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.SmallTest
import app.cash.turbine.test
import com.innov8.data.matches.local.db.FavoriteMatchesDao
import com.innov8.data.matches.local.db.MatchesDatabase
import com.innov8.data.matches.pojo.FakeMatchResource
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.runBlocking
import org.junit.After
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
@SmallTest
class MatchesDatabaseTest {

    private lateinit var favDao: FavoriteMatchesDao
    private lateinit var database: MatchesDatabase

    @Before
    fun createDb() {
        val context = ApplicationProvider.getApplicationContext<Context>()

        database = Room.inMemoryDatabaseBuilder(context, MatchesDatabase::class.java)
            .allowMainThreadQueries().build()
        favDao = database.favoriteMatchesDao()
    }

    @After
    fun tearDown() {
        database.close()
    }


    @Test
    fun insertMatch() = runBlocking {
        val fakeMatch = FakeMatchResource(9871, "2021-10-31T12:30:00Z")
        favDao.insertMatch(fakeMatch)

        //actual
        val actual = favDao.selectFavoriteMatch(fakeMatch.id.toString())

        actual.test {
            assertSame(fakeMatch, awaitItem())
        }
    }

    @Test
    fun selectAllIdsOnlyFromDataBase() = runBlocking {
        val fakeMatch = FakeMatchResource(20, "2021-10-31T12:30:00Z")
        val fakeMatch2 = FakeMatchResource(21, "2021-10-31T12:30:00Z")

        favDao.insertMatch(fakeMatch)
        favDao.insertMatch(fakeMatch2)

        //actual
        val actual = favDao.selectFavoriteMatchIDs()
        val expected = listOf(20, 21)

        actual.test {
            val awaitItem = awaitItem()

            assertEquals(expected[1], awaitItem[1])
            assertEquals(expected[0], awaitItem[0])

        }
    }

    @Test
    fun delete_match_item() = runBlocking {
        val match = FakeMatchResource(888, "2021-10-31T12:30:00Z")
        favDao.insertMatch(match)
        favDao.deleteFavoriteMatch(match)

        val actualMatch = favDao.selectFavoriteMatch(match.id.toString())
        actualMatch.test {

            assertEquals(null, awaitItem())

            // assertThat(allList).doesNotContain(actualMatch)
        }


    }


    @Test
    fun fetch_matches_by_descending_date() = runBlocking {

        val entites = listOf(
            FakeMatchResource(1, "2021-10-31T12:30:00Z"),
            FakeMatchResource(2, "2019-10-31T12:30:00Z"),
            FakeMatchResource(3, "2010-10-31T12:30:00Z"),
            FakeMatchResource(4, "2022-10-31T12:30:00Z"),
            FakeMatchResource(5, "2022-12-01T12:30:00Z"),
        )

        favDao.insertMatchesList(entites)

        val favSavedMatchesList = favDao.selectAllFavoriteMatchesList().first()

        //expected
        val expected = listOf(5, 4, 1, 2, 3)

        //actual
        val actual = favSavedMatchesList.sortedByDescending { it.utcDate }.map { it.id }

        assertEquals(expected, actual)
    }

}