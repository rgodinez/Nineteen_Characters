/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.controller;

/**
 *
 * @author JohnReedLOL
 */
public final class Avatar
{
    // Converts the class name into a base 35 number
    private static final long serialVersionUID = Long.parseLong("Avatar", 35);    

    // Avatar.avatar_ is static because there is only one avatar_  
    private static Character avatar_;
    
    public static Character getaReferenceToTheAvatar() {
        return Avatar.avatar_;
    }
}
