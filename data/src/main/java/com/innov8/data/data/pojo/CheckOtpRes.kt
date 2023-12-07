package com.innov8.data.data.pojo

import com.google.gson.annotations.SerializedName

data class CheckOtpRes(

	@field:SerializedName("data")
	val data: CheckOtpData? = null,

	@field:SerializedName("errors")
	val errors: Errors? = null
)

data class Errors(

	@field:SerializedName("country_code")
	val countryCode: List<String?>? = null,

	@field:SerializedName("code")
	val code: List<String?>? = null,

	@field:SerializedName("phone_number")
	val phoneNumber: List<String?>? = null
)

data class CheckOtpData(

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("token")
	val token: String? = null
)
