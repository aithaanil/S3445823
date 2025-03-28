package uk.ac.tees.mad.carcare

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level
import uk.ac.tees.mad.carcare.di.appModules

class CarCareApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(Level.DEBUG) // Optional: Log Koin activities
            androidContext(this@CarCareApplication)
            modules(appModules)
        }
    }
}