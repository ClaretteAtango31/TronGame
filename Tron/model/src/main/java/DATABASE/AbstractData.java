package DATABASE;

import java.sql.CallableStatement;
import java.sql.ResultSet;

/**
 * <h1>The Class AbstractLoader.</h1>
 * 
 *  
 * @version 1.0
 */
public class AbstractData {
	
	 /**
     * Execute query.
     *
     * @param query
     *            the query
     * @return the result set
     */
    protected static ResultSet executeQuery(final String query) {
        return TronBDDConnector.getInstance().executeQuery(query);
        
    }

    /**
     * Execute update.
     *
     * @param query
     *            the query
     * @return the int
     */
    protected static int executeUpdate(final String query) {
        return TronBDDConnector.getInstance().executeUpdate(query);
        
    }

    /**
     * Prepare call.
     *
     * @param query
     *            the query
     * @return the callable statement
     */
    protected static CallableStatement prepareCall(final String query) {
        return TronBDDConnector.getInstance().prepareCall(query);
        
    }
    
}