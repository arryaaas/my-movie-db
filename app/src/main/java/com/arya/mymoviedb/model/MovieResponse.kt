package com.arya.mymoviedb.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue

data class MovieResponse(
    @SerializedName("results")
    val result: List<MovieResult>
)

@Parcelize
@Entity(tableName = "MovieResult")
class MovieResult (

    @PrimaryKey
    @SerializedName("id")
    var id: Int = 0,

    @SerializedName("title")
    var title: String = "",

    @SerializedName("overview")
    var overview: String? = "",

    @SerializedName("poster_path")
    var posterPath: String? = "",

    @SerializedName("backdrop_path")
    var backdropPath: String? = "",

    @SerializedName("release_date")
    var releaseDate: String? = "",

    @SerializedName("vote_average")
    var voteAverage: Float? = 0F,

    @SerializedName("genre_ids")
    @Ignore
    var genreIds: List<Int>? = null,

    var genre: @RawValue List<String>? = null,

    var cast: @RawValue List<Cast>? = null,

    var trailer: @RawValue List<Trailer>? = null

): Parcelable
