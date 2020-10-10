object ApplicationId {
    val id = "me.mickgian.multimod"
}

object Modules {
    val app = ":app"

    val navigation = ":navigation"
    val common = ":common"

    val network = ":network"
    val model = ":data:model"
    val repository = ":data:repository"

    val featureHome = ":features:home"
    val featureDetail = ":features:detail"
}

object Releases {
    val versionCode = 1
    val versionName = "1.0"
}

object Versions {
    val kotlin = "1.3.71"
    val gradle = "3.4.2"
    val compileSdk = 29
    val minSdk = 23
    val targetSdk = 29
    val appCompat = "1.1.0"
    val coreKtx = "1.2.0"
    val constraintLayout = "2.0.0-beta6"
    val retrofit = "2.6.0"
    val retrofitGson = "2.5.0"
    val gson = "2.8.5"
    val okHttp = "3.12.1"
    val koin = "2.1.5"
    val lifecycle = "2.2.0"
    val nav = "2.2.2"
    val recyclerview = "1.1.0"
    val reactiveAndroid = "2.1.1"
    val reactiveJava = "2.2.9"
    val safeArgs = "2.2.2"
}

object Libraries {
    // KOIN
    val koin = "org.koin:koin-android:${Versions.koin}"
    val koinViewModel = "org.koin:koin-android-viewmodel:${Versions.koin}"
    // RETROFIT
    val gson = "com.google.code.gson:gson:${Versions.gson}"
    val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    val retrofitRxAdapter = "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofit}"
    val retrofitGsonConverter = "com.squareup.retrofit2:converter-gson:${Versions.retrofitGson}"
    val httpLoggingInterceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.okHttp}"
    //RX
    val rxAndroid = "io.reactivex.rxjava2:rxandroid:${Versions.reactiveAndroid}"
    val rxJava = "io.reactivex.rxjava2:rxjava:${Versions.reactiveJava}"
}

object KotlinLibraries {
    val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
}

object AndroidLibraries {
    // ANDROID
    val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
    val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    val lifecycleViewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
    val liveData = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycle}"
    val lifecycleService = "androidx.lifecycle:lifecycle-service:${Versions.lifecycle}"
    val lifecycleProcess = "androidx.lifecycle:lifecycle-process:${Versions.lifecycle}"
    val recyclerView = "androidx.recyclerview:recyclerview:${Versions.recyclerview}"
    val navigation = "androidx.navigation:navigation-ui-ktx:${Versions.nav}"
    val navigationFrag = "androidx.navigation:navigation-fragment-ktx:${Versions.nav}"
}
