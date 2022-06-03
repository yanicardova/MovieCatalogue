package com.example.moviecatalouge.movie

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Movie(
    @SerializedName("id")
    val id : String ?,

    @SerializedName("genres")
    val genre : String?,

    @SerializedName("title")
    val title : String?,

    @SerializedName("poster_path")
    val poster : String?,

    @SerializedName("popularity")
    val popular : String?,

    @SerializedName("release_date")
    val release : String?

) : Parcelable {
    constructor() : this("", "", "", "","","")
}

