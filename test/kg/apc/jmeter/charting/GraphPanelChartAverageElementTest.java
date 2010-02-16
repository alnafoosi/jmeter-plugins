package kg.apc.jmeter.charting;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class GraphPanelChartAverageElementTest
{
   public GraphPanelChartAverageElementTest()
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
    * Test of add method, of class GraphPanelChartAverageElement.
    */
   @Test
   public void testAdd()
   {
      System.out.println("add");
      double yVal = 0.0;
      GraphPanelChartAverageElement instance = new GraphPanelChartAverageElement();
      instance.add(yVal);
   }

   /**
    * Test of getValue method, of class GraphPanelChartAverageElement.
    */
   @Test
   public void testGetValue()
   {
      System.out.println("getValue");
      GraphPanelChartAverageElement instance = new GraphPanelChartAverageElement();
      double expResult = 0.0;
      double result = instance.getValue();
      assertEquals(expResult, result, 0.0);
   }

   /**
    * Test of getCount method, of class GraphPanelChartAverageElement.
    */
   @Test
   public void testGetCount()
   {
      System.out.println("getCount");
      GraphPanelChartAverageElement instance = new GraphPanelChartAverageElement();
      int expResult = 0;
      int result = instance.getCount();
      assertEquals(expResult, result);
   }
}
