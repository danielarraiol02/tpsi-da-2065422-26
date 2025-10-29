package pt.uma.tpsi.ad.utils;

public class Professor extends User{

    @Override
    public void createEmail() {
        email = firstName + "." + lastName + "@staff.uma.pt";
    }
}
