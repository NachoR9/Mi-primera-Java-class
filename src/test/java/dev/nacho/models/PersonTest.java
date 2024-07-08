package dev.nacho.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PersonTest {

    @Test
    void testGetBornDate() {
        Person Nacho = new Person ("Nacho", "Rodriguez", "87653422P", 1986, "España", 'H');
        assertEquals(1986, Nacho.getBornDate());
    }

    @Test
    void testGetCountry() {
        Person Nacho = new Person ("Nacho", "Rodriguez", "87653422P", 1986, "España", 'H');
        assertEquals("España", Nacho.getCountry());
        
    }

    @Test
    void testGetDni() {
        Person Nacho = new Person ("Nacho", "Rodriguez", "87653422P", 1986, "España", 'H');
        assertEquals("87653422P", Nacho.getDni());
    }

    @Test
    void testGetGender() {
        Person Nacho = new Person ("Nacho", "Rodriguez", "87653422P", 1986, "España", 'H');
        assertEquals('H', Nacho.getGender());
    }

    @Test
    void testGetLastname() {
        Person Nacho = new Person ("Nacho", "Rodriguez", "87653422P", 1986, "España", 'H');
        assertEquals("Rodriguez", Nacho.getLastname());
    }

    @Test
    void testGetName() {
        Person Nacho = new Person ("Nacho", "Rodriguez", "87653422P", 1986, "España", 'H');
        assertEquals("Nacho", Nacho.getName());
    }
}
