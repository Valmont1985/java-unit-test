@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
	assertEquals("The user is over 18 years old, but checkIsAdult returned false", 
true, isAdult);
}
