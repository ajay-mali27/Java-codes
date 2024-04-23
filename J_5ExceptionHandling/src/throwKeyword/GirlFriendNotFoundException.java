package throwKeyword;

public class GirlFriendNotFoundException extends RuntimeException {
public String getMessage() {
	return "Error 404 : Girlfriend Not Found";
}
}
