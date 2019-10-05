package pl.coderslab.utils;

import org.mindrot.jbcrypt.BCrypt;

public final class PasswordUtil {

    private PasswordUtil() {}

    public static String createHash(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }
}

//klasy util są final po to żeby nie można było ich rozszerzać