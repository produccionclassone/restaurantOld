package es.classone.restaurant.model.userservice;

@SuppressWarnings("serial")
public class DuplicateFavoriteException extends Exception {
	private int	useCase;

    public DuplicateFavoriteException (int useCase) {
        super("Duplicate Favorite exception => useCase = " + useCase);
        this.useCase = useCase;
    }

    public int getUseCase() {
        return useCase;
    }
}
