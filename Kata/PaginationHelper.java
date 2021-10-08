import java.util.Arrays;
import java.util.List;


public class PaginationHelper<I> {
    private final int items;
    private final List<I> list;

    public PaginationHelper(List<I> collection, int itemsPerPage) {
        list = collection;
        items = itemsPerPage;
    }

    public int itemCount() {
        return list.size();
    }

    public int pageCount() {
        return (int)Math.ceil((float)list.size() / items);
    }

    public int pageItemCount(int pageIndex) {
        if (pageIndex < this.pageCount() - 1) return items;
        if (pageIndex == this.pageCount() - 1) return list.size() % items;
        else return -1;
    }

    public int pageIndex(int itemIndex) {
        if (0 <= itemIndex && itemIndex < list.size()) return (itemIndex) / items;
        return -1;
    }

    public static void main(String[] args) {
        PaginationHelper<Character> helper = new PaginationHelper<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);
        helper.pageCount(); //should == 2
        helper.itemCount(); //should == 6
        helper.pageItemCount(0); //should == 4
        helper.pageItemCount(1); // last page - should == 2
        helper.pageItemCount(2); // should == -1 since the page is invalid

        System.out.println(helper.pageCount()); //should == 2
        System.out.println(helper.itemCount()); //should == 6
        System.out.println(helper.pageItemCount(0)); //should == 4
        System.out.println(helper.pageItemCount(1)); // last page - should == 2
        System.out.println(helper.pageItemCount(2)); // should == -1 since the page is invalid

        // pageIndex takes an item index and returns the page that it belongs on
        System.out.println(helper.pageIndex(5)); //should == 1 (zero based index)
        System.out.println(helper.pageIndex(2)); //should == 0
        System.out.println(helper.pageIndex(20)); //should == -1
        System.out.println(helper.pageIndex(-10)); //should == -1
    }
}