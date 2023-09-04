package net.lavedrine.homestock.exception;

public class CategoryNotFoundException extends RuntimeException {

    private CategoryNotFoundException(String message) {
        super(message);
    }

    public static CategoryNotFoundException categoryIdNotFoundException(Integer categoryId) {
        return new CategoryNotFoundException("No category found with id: '" + categoryId + "'");
    }
}
