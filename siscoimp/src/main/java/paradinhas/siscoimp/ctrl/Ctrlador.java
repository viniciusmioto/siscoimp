/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paradinhas.siscoimp.ctrl;

import paradinhas.siscoimp.models.User;

/**
 *
 * @author rodri
 */
public class Ctrlador {

    static public Ctrlador ctrl;
    private User user = new User();

    private Ctrlador() {
    }

    static public Ctrlador instance() {
        if (ctrl == null) {
            ctrl = new Ctrlador();
        }
        return ctrl;
    }

    public void updateUser(String name, String address, String email,String phone,String imagePath) {
        this.user.setName(name);
        this.user.setAddress(address);
        this.user.setEmail(email);
        this.user.setPhone(phone);
        this.user.setImagePath(imagePath);
    }

    public User getUser() {
        return this.user;
    }
}
