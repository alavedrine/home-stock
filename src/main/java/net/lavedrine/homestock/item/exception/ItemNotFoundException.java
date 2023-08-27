package net.lavedrine.homestock.item.exception;

public class ItemNotFoundException extends RuntimeException {

    private ItemNotFoundException(String message) {
        super(message);
    }

    public static ItemNotFoundException itemIdNotFoundException(Integer itemId) {
        return new ItemNotFoundException("No item found with id: '" + itemId + "'");
    }
}
