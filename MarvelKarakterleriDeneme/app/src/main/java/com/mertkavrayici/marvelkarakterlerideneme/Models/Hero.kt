package com.mertkavrayici.marvelkarakterlerideneme.Models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class Hero (
    var id:Int?,
    var name:String,
    var description:String,
    var modified:String?,
    var thumbnail:Thumbnail?,
    var resourceURI:String?,
    var comics:Comics?,
    var series:Series?,
    var stories:Stories?,
    var events:Events?,
    var urls:List<ItemUrls>?
    ): Parcelable
