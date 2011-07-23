package net.wagstrom.logging.logbackAddOns;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AnsiColorConvereterTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AnsiColorConvereterTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AnsiColorConvereterTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    public void testLog() {
    	Logger log = LoggerFactory.getLogger(this.getClass());
    	log.error("test error message");
    	log.warn("test warn message");
    	log.info("test info message");
    	log.debug("test debug message");
    	log.trace("test trace message");
    	assertTrue( true );
    }
}
