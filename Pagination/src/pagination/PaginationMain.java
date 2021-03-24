package pagination;

public class PaginationMain {

	public static void main(String[] args) {
		
		// Below are the input values to the Paginationhelper class.
		
		// We can make these values dynamic.
		
		
		// this represents number of items 
		int[] items = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};

		// This represents number of items per page.
		int itemsPerPage = 3;


		// This is the Paginationhelper class where i have all the method to get the details.
		
		PaginationHelper helper = new PaginationHelper(items,itemsPerPage);

		System.out.println("Total Pages :: "+helper.pageCount());

		System.out.println("Total Items :: "+helper.itemCount());

		System.out.println("Items Per Page :: "+helper.itesmPerPage);

		System.out.println("Items in page 65 :: "+helper.pageItemCount(5));
		
	
		// here as per the requirment page number starts with Zero . example  0,1,2,3,4  in this case total pages are 5 
		
		System.out.println("Item page index ::"+helper.pageIndex(7));

	}

}
