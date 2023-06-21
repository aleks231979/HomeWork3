
public class PhoneNumberException extends RuntimeException{
    public PhoneNumberException() {
        super("Вы ввели некорректный номер телефона! Образец: 89871471122");
    }
}
