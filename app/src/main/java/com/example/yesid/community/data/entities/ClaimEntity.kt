package com.example.yesid.community.data.entities

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import javax.security.auth.Subject

@Entity(tableName = "claimDB")
data class ClaimEntity(@PrimaryKey(autoGenerate = true) @ColumnInfo(name = "id")val id: Int?,
                       @ColumnInfo (name = "subjetc")val subject: String,
                       @ColumnInfo (name = "description")val description: String,
                       @ColumnInfo (name = "type")val type : String,
                       @ColumnInfo (name = "uriImage")val uriImage : String,
                       @ColumnInfo (name = "date")val date: String)
