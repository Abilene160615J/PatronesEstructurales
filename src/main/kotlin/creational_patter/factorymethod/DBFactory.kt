package creational_patter.factorymethod

import creational_patter.properties.PropertiesUtil.loadProperty
import kotlin.reflect.full.createInstance

class DBFactory {
    private  val _DB_FACTORY_PROPERTY_URL = "creational_patter/properties/DBFactory"
    private  val _DEFAULT_DB_CLASS_PROP = "defaultDBClass"
    fun getDBadapter(dbType: DBType?): IDBAdapter {
        return when (dbType) {
            DBType.MySql -> MySqlDBAdapter()
            DBType.Oracle -> OracleDBAdapter()
            else -> throw IllegalArgumentException("No soportado")
        }
    }

    val defaultDBAdapter: IDBAdapter?
        get() = try {
            val property = loadProperty(_DB_FACTORY_PROPERTY_URL)
            val defaultDBClass = property!!.getProperty(_DEFAULT_DB_CLASS_PROP)
            Class.forName(defaultDBClass).kotlin.createInstance() as IDBAdapter
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
}
