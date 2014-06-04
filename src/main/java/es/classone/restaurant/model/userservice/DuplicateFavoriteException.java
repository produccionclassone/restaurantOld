package es.classone.restaurant.model.userservice;

@SuppressWarnings("serial")
public class DuplicateFavoriteException extends Exception {
	private String	useCase;

    public DuplicateFavoriteException (String useCase) {
        super("Duplicate Favorite exception => useCase = " + useCase);
        this.useCase = useCase;
    }

    public String getUseCase() {
        return useCase;
    }
}
