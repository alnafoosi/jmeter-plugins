package kg.apc.jmeter.charting;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class GraphPanelChartExactElementTest
{
   public GraphPanelChartExactElementTest()
   {
   }

   @BeforeClass
   public static void setUpClass() throws Exception
   {
   }

   @AfterClass
   public static void tearDownClass() throws Exception
   {
   }

   @Before
   public void setUp()
   {
   }

   @After
   public void tearDown()
   {
   }

   /**
    * Test of getValue method, of class GraphPanelChartExactElement.
    */
   @Test
   public void testGetValue()
   {
      System.out.println("getValue");
      GraphPanelChartExactElement instance = null;
      double expResult = 0.0;
      double result = instance.getValue();
      assertEquals(expResult, result, 0.0);
   }

   /**
    * Test of getX method, of class GraphPanelChartExactElement.
    */
   @Test
   public void testGetX()
   {
      System.out.println("getX");
      GraphPanelChartExactElement instance = null;
      long expResult = 0L;
      long result = instance.getX();
      assertEquals(expResult, result);
   }
}
