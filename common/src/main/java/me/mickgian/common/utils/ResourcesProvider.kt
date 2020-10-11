package me.mickgian.common.utils

import android.content.Context
import androidx.annotation.ColorRes
import androidx.core.content.ContextCompat
import org.koin.core.KoinComponent


/**
 * This class serves as a Provider for Strings, Drawables and colors for ViewModels.
 * This approach allows to not reference Context into ViewModels to avoid memory leaks.
 * The implementation of the ResourcesProvider will contain a reference to the Context but
 * the ViewModel will only refer to the ResourcesProvider.
 */

class ResourcesProvider (ctx: Context): KoinComponent {

    val context = ctx

    fun getColor(@ColorRes colorResource: Int): Int {
        return ContextCompat.getColor(context, colorResource)
    }

}