package pagination;

public class PaginationHelper {


	int[] totalItems;
	int itesmPerPage;
	
	int quotient = 0;
	int remainder = 0;


	public PaginationHelper(int[] numberOfItems , int itemsPerPage) {
		this.totalItems = numberOfItems;
		this.itesmPerPage = itemsPerPage;
	}
	
	/*
	 * Below method get the page count.
	 * 
	 */

	public int pageCount() {
		int tItemsLen = totalItems.length;
		int itemsPP = itesmPerPage;
		int actualPageCount = 0;

		if(tItemsLen >= itemsPP) {
			quotient = tItemsLen / itemsPP;
			remainder = tItemsLen % itemsPP;
			if(remainder > 0) {
				actualPageCount = quotient + 1;
			}
		}

		return actualPageCount;
	}

	
	/*
	 * Below methods returns total item count.
	 * 
	 * 
	 */
	public int itemCount() {
		int tItemsLen = totalItems.length;
		int actualItemCount;
		if(tItemsLen >= 0) {
			actualItemCount = tItemsLen;

		}else {
			actualItemCount = -1;
		}

		return actualItemCount;
	}
	
	/*
	 * Below method retusn the number of itmes in a particular page.
	 * 
	 * 
	 */

	public int pageItemCount(int pageNumber) {
		int actualPCount = this.pageCount();
		int itemsPerPage1=0;
		if(pageNumber < quotient && pageNumber > 0 ) {
			itemsPerPage1 =  itesmPerPage;
		}else if (pageNumber == quotient) {
			itemsPerPage1 = remainder;
		}else if (pageNumber > actualPCount-1) {
			itemsPerPage1 = -1;
		}

		return itemsPerPage1;
	}
	
	/*
	 *below method returns page number for a particular item index. 
	 * 
	 */
	 public int pageIndex(int page_index) {
	        if(page_index < 0 || page_index >= this.itemCount()) return -1;
	        return (page_index-1)/itesmPerPage;
	    }



}
