package com.example.yesid.community.domain.model

import android.accounts.AuthenticatorDescription
import javax.security.auth.Subject

data class Claim (val id: Int?,
                  val subject: String,
                  val description: String,
                  val type : String,
                  val uriImage : String,
                  val date : String)