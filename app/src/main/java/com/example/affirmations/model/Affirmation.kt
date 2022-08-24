package com.example.affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StyleRes

data class Affirmation(@StyleRes val stringResourceId: Int,
                       @DrawableRes val imageResourceId: Int) {


}