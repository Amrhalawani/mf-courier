package com.innov8.data.matches.pojo

import com.google.gson.annotations.SerializedName

data class ReportsRes(

	@field:SerializedName("data")
	val data: Data? = null
)

data class Data(

	@field:SerializedName("successTries")
	val successTries: Int? = null,

	@field:SerializedName("totalAmounts")
	val totalAmounts: String? = null,

	@field:SerializedName("returnsOrders")
	val returnsOrders: Int? = null,

	@field:SerializedName("deliveredOrders")
	val deliveredOrders: Int? = null,

	@field:SerializedName("assignedOrders")
	val assignedOrders: Int? = null
)
