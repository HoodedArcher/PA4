/*
 *  Read in TWO serialized files of objects: 
 *     Customer
 *     Policy
 *  Store objects in collections - each file/type in a separate collection
 *  Sort each collection into ASCENDING ORDER by custNumber
 *  
 *  Process match/merge report:
 *      All Policy objects
 *          By Customer
 * 
 * (c) 2019, Terri Davis
 */

/******************************************************************************************************************
 *****************************************************************************************************************
 ******************        ADD NECESSARY IMPORT STATEMENTS HERE
 *****************************************************************************************************************
 ******************************************************************************************************************/ 
/************************************************************************************************************
 *  IMPORTS FOR I/O MANAGEMENT & DESERIALIZATION
 ************************************************************************************************************/ 


/************************************************************************************************************
 *  IMPORTS FOR COLLECTION MANAGEMENT
 ************************************************************************************************************/ 


public class CustomerPolicyReport
{
/******************************************************************************************************************
 *****************************************************************************************************************
 ******************        ADD DECLARATIONS FOR INPUT FILES AND COLLECTIONS TO STORE OBJECTS
 *****************************************************************************************************************
 ******************************************************************************************************************/ 
   /*-----------------------------------------------------------------------------------------------------
                       GLOBAL DECLARATIONS AND/OR INSTANTIATIONS AND/OR INITIALIZATIONS
    -----------------------------------------------------------------------------------------------------*/
   // DECLARATION ONLY of BufferedReaders; INSTANTIATION to be completed in openFiles methos
;
   
   // DECLARE ONLY copies of XML SERIALIZATION HELPER code

   
   // DECLARATION & INSTANTIATION of (LOCAL) Collection objects...  This is done for ease of use later...

    
   // DECLARE and INITIALIZE variable to hold ACCUMULATED EXPOSURE value

 
   /**************************************************************************************************************
    *  main method 
    *************************************************************************************************************/
   public static void main( String[] args)
   {
     /*
      *  The try block executes the following processes:
      *     Open input files
      *     create and output report entries
      *     close input files
      *  NOTE: All serialized objects in the XML documents have already undergone data validation and instantiation;
      *        we will not need to check for CustomerException or PolicyException in this code.
      */   
     try
     {
       openFiles();
       processReport();
       closeFiles();
     }  // end try
     catch( IOException xcptn )                       // If there is any error in opening,reading, or closing files
     {
       System.err.println( "Ending process." );
     } // end catch
     catch( Exception xcptn )                         // Any/all other exceptions passed up to main
     {
       System.err.printf( "Serious error. Ending proces.  %s",
                           xcptn.getClass( ).getName( ) );
       xcptn.printStackTrace( );
     } 
     
   }// end main

   /***************************************************************************************************************
    *  Open the input files
    **************************************************************************************************************/   
   /*
    *  Locate the physical file; define it as an input stream; define the input stream as an object stream.
    *  Prepare to deseralize objects from the file.
    */
   public static void openFiles( )
                      throws IOException
   {
     /******************************************************************************************************************
      *****************************************************************************************************************
      ******************        ADD CODE TO OPEN INPUT FILES, INCLUDED NECESSARY EXCPETION HANDLING
      *****************************************************************************************************************
      ******************************************************************************************************************/ 
     try 
     {
       /*
        *  Instantiate one BufferedReader object for each input XML document
        */
       
     } // end try
     catch ( IOException xcptn )
     {
       System.err.println( "Error opening input file." );
       xcptn.printStackTrace( );
       throw xcptn;
     } // end catch
   } // end method openFile

   
   /***************************************************************************************************************
    *  Manage the actual reporting process
    **************************************************************************************************************/   
   /*
    * Deserialize Customer file; store objects in collection. Sort collection when file is completely deserialized.
    * 
    * Deserialize Policy file; store objects in collection. Sort collection when file is completely deserialized.
    * 
    * Process match/merge based on Customer.
    *  For each Customer:
    *    Output Customer information.
    *       Output Policy information
    *       Output CostBasis for Policy 
    *  
    */
   public static void processReport( )
                      throws Exception
   {
     try
     {
       prepCustomerCollection( );
       prepPolicyCollection( );
       reportExposures( );
       
       /*
        *  Output final total of all Poicy book values
        *    This can be placed in other locations and still work...
        */
       System.out.printf( "%n%n%n%n\t\tTotal Exposure of All Contracts: $%,.2f%n", 
                           totalExposure );
       
     }  // end try block
     catch( Exception xcptn )
     {
       System.err.printf( "Serious error. Ending proces.  %s",
                           xcptn.getClass( ).getName( ) );
       xcptn.printStackTrace( );
     }
 
   } // end method processRecords
 
   /***************************************************************************************************************
    *  Close the input files
    **************************************************************************************************************/
   public static void closeFiles( )
                      throws IOException
   {
      /******************************************************************************************************************
       *****************************************************************************************************************
       ******************        ADD CODE TO CLOSE INPUT FILES, INCLUDED NECESSARY EXCPETION HANDLING
       *****************************************************************************************************************
       ******************************************************************************************************************/ 

   } // end method closeFiles

   
   /***************************************************************************************************************
    *  Prepare the Customer collection
    **************************************************************************************************************/   
   /*
    *  Deserialize all objects from serialized Customer file
    *     As each object is deserialized (read), add it to the collection holding Customer objects
    *  Once all Customer objects have been stored in the collection,
    *     Sort the collection in ascending order, based on custNumber value of each object.
    */
   public static void prepCustomerCollection( )
                      throws ClassNotFoundException,
                             IOException
   {
      /*****************************************************************************************************************
       *****************************************************************************************************************
       ******************        ADD CODE TO: 
       ******************                      DESERIALIZE CUSTOMER OBJECTS  
       ******************                      ADD OBJECTS TO COLLECTION  
       ******************                      HANDLE NECESSARY EXCEPTIONS  
       ******************                      SORT COMPLETED COLLECTION INTO ASCENDING ORDER BY custNumber
       *****************************************************************************************************************
       *****************************************************************************************************************/ 
       /*
        * Instantiate globally declared copies of HELPER code, using JAXB.unmarshal method
        */
 
       /*
        *  Copy DESERIALIZED Object Collection to local Collection
        */


       /*
        *  Sort (local) Collection object into ASCENDING ORDER, based on custId values
        */

   } // end prepCustomerCollection

   /***************************************************************************************************************
    *  Prepare the Policy collection
    **************************************************************************************************************/   
   /*
    *  Deserialize all objects from serialized Policy file
    *     As each object is deserialized (read), add it to the collection holding Policy objects
    *  Once all Policy objects have been stored in the collection,
    *     Sort the collection in ascending order, based on custNumber value of each object.
    */
   public static void prepPolicyCollection( )
                      throws ClassNotFoundException,
                             IOException
   {
      /*****************************************************************************************************************
       *****************************************************************************************************************
       ******************        ADD CODE TO: 
       ******************                      DESERIALIZE SECURITY OBJECTS  
       ******************                      ADD OBJECTS TO COLLECTION  
       ******************                      HANDLE NECESSARY EXCEPTIONS  
       ******************                      SORT COMPLETED COLLECTION INTO ASCENDING ORDER BY custNumber
       *****************************************************************************************************************
       *****************************************************************************************************************/ 
       /*
        * Instantiate globally declared copies of HELPER code, using JAXB.unmarshal method
        */

              
       /*
        *  Copy DESERIALIZED Object Collection to local Collection
        */
 
       /*
        *  Sort (local) Collection object into ASCENDING ORDER, based on owner values
        */
  
              
   } // end prepPolicyCollection

   /***************************************************************************************************************
    *  Report Book Values
    **************************************************************************************************************/   
   /*
    *    Once both input files have been deserialized, both collections built, and both sorted,
    *    Use a matching algorithm to report contract information for all Customer objects 
    */
   public static void reportExposures( )
   { 
     /*
      * Declare an object to use to move through the collection of Policy objects
      * Using that object, pick up the 'next' Policy object available, assign it the name ‘contract’
      * Retrieve the owner value from that object and store it in a variable named 'holdOwner'
      */ 
     
      /*****************************************************************************************************************
       *****************************************************************************************************************
       ******************        ADD THE FOLLOWING CODE =ABOVE= THE CALL TO findCustomer:
       ******************            Declare an iterator for use with the Policy collection
       ******************            Use that iterator to retrieve a Policy object; name the object retrieved "contract"
       ******************            Retrieve the owner of the contract object; store it as "holdOwner"
       *****************************************************************************************************************
       *****************************************************************************************************************/ 
      
     /*
      * Declare an object to use to move through the collection of Policy objects
      * Using that object, pick up the 'next' Policy object available, assign it the name ‘contract’
      * Retrieve the custNumber value from that object and store it in a variable named 'holdOwner'
      */ 

     
     findCustomer( holdOwner );                      // Pass the owner value retrieved from the Policy object
      
     try
     {
       while( true )                                 // This is effectively an infinite loop that will end when an
       {                                             //  exception is thrown to indicate we've "run out" of Policy 
                                                     //  objects in the localPolicies collection
         while( contract.getPolOwner( ).matches( holdOwner ) )      // While we have more Policy objects for this Customer
         {
           double exposure = contract.calcExposure( );           // We'll need this in a couple of places in the loop
           // Output a line describing this Policy
           System.out.printf( "\t%-10s %-5s carries an exposure of %15s%n",
                             contract.getClass( ).getName( ),
                             contract.getPolNumber( ),
                             String.format( "$%,.2f", exposure ) );
  
           // Add the current book value of this Policy to the total assets managed
           totalExposure = totalExposure + exposure;
  
           // Move to the next Policy
           contract = policyIterator.next( );
         }  // end INNER while (we've found all Policy objects belonging to this Customer)
         // This is just an indication (or "flag" ) that we're done with this Customer's Policy objects
         System.out.printf( "=========================================================================%n%n" );
         holdOwner = contract.getPolOwner( );
         findCustomer( holdOwner );
       }  // end OUTER while  (we've run out of Policy objects to process)
       
     }  // end try block
     catch( NoSuchElementException endOfCollection )
     {
       /*
        * This Exception is EXPECTED to be thrown when we "run out" of Policy objects; it ends the outer while loop
        */
       System.out.printf( "%n%n\t\t\t ***** END OF POLICY REPORT *****%n" );
     }  // end catch NoSuchElementException  
     
   } // end reportExposures
   
   /***************************************************************************************************************
    *  Find Customer
    **************************************************************************************************************/   
   /*
    *  Using the target custNumber passed into the method from the calling code...
    *     Search the sorted Customer objects for the one matching the provided target object
    *     Assign the located Customer object to the reference found
    *     Using the Customer reference found, produce the report header
    */
   public static void findCustomer( String findCust )
   {
     
     try
     {
       /*
        *  Set up for Customer search. 
        *  The "important" piece is the custNumber -> findCust.All other information is essentially filler and
        *    will not be used in the search process.
        */ 

       
      /******************************************************************************************************************
       *****************************************************************************************************************
       ******************        ADD CODE TO SEARCH CUSTOMER COLLECTION FOR DESIRED CUSTOMER OBJECT,
       ******************            AND TO THEN RETRIEVE THE LOCATED OBJECT. NAME THE RETRIEVED OBJECT "found"
       *****************************************************************************************************************
       ******************************************************************************************************************/ 
      /*
        *  Call binarySearch (API) method. Method returns an integer representing the location in the 
        *    Collection of the target object. 
        *  If the return value is > -1, the object was found; -1 would indicate the object does not exist
        *    in the Collection
        */

       /*
        *  Test the return from binarySearch. The process will actually work without this, but it's 
        *    good practice (and solid coding)...
        */
       if( ............ )
       {  // We found the Customer we were looking for....
         found    = localCustomers.get( foundIt );
 
          // Print the first report break header
          System.out.printf( "%n%-20s %-20s Customer %s, TID %s%n",   
                              found.getCustFirstName( ),
                              found.getCustLastName( ),
                              found.getCustId( ),
                              found.getCustTaxId( ) );
       }
       else   // This won't actually happen in our case....
      {  // The Customer we want does not exist within the Collection
         // Print the Customer identification line
         System.out.printf( "%-20s %-20s Customer %s, TIN %s%n",   
                            "Missing",
                            "Customer",
                            "XXXXXXX",
                            "XXXXXXXXX" );         
       }  // end negative branch         
     }
     catch( CustomerException xcptn )
     {
       System.err.printf( "Error building target Customer object.%n" );
       System.err.printf( "\t\t%s%n",
                           xcptn.getMessage( ) );
     }  // end catch
   }  // end findCustomer
 
 } // end class CustomerPolicyReport