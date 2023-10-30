package creational_patter.abstractfactory

import creational_patter.properties.PropertiesUtil.loadProperty
import kotlin.reflect.full.createInstance

class ServiceStackAbstractFactory {
        companion object {
            fun createServiceFactory(): IServiceStackAbstractFactory? {
                val property = loadProperty(
                    "creational_patter/properties/abstractfactory"
                )
                val factoryClass = property!!.getProperty("serviceProductImplClass")
                return try {
                    Class.forName(factoryClass).kotlin.createInstance() as IServiceStackAbstractFactory
                } catch (e: Exception) {
                    e.printStackTrace()
                    null
                }
            }

        }
    }

