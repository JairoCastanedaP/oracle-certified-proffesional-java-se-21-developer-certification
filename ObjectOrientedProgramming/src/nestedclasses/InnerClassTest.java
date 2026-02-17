package nestedclasses;

import nestedclasses.User.InnerUser;

public class InnerClassTest {

    public static void main(String[] args) {

        User outer = new User();
        InnerUser inner= outer.new InnerUser();
        inner.show();
    }
}
