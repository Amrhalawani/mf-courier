package com.innov8.data.data.pojo

import com.google.gson.annotations.SerializedName

data class HomeRes(

	@field:SerializedName("data")
	val data: HomeData? = null
)

data class AreasItem(

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("id")
	val id: Int? = null
)

data class DeliveryTimesItem(

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("id")
	val id: Int? = null
)

data class OrderTypesItem(

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("id")
	val id: Int? = null
)

data class HomeData(

	@field:SerializedName("deliveryTimes")
	val deliveryTimes: List<DeliveryTimesItem?>? = null,

	@field:SerializedName("orderTypes")
	val orderTypes: List<OrderTypesItem?>? = null,

	@field:SerializedName("areas")
	val areas: List<AreasItem?>? = null,

	@field:SerializedName("currentAssignedOrders")
	val currentAssignedOrders: Int? = null
)
