package com.demoa.tests;

import com.demoqa.pages.HomePage;
import com.demoqa.pages.PracticeFormPage;
import com.demoqa.pages.SidePanel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PracticeFormTest extends TestBase{

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getForms();
        new SidePanel(driver).selectPracticeForm().hideIframes();
    }

    @Test
    public void registerNewStudentTest() {
        new PracticeFormPage(driver)
                .enterPersonalData("Mickey","Rourke","nmail@mail.com","9874563210")
                .selectGender("Male")
                .enterDate("16 Aug 1987")
                .selectSubjects(new String[]{"Maths","English","Chemistry"})
                .selectHobbyes(new String[]{"Sports","Music"})
                .uploadFile("/home/timur/Документы/1688_card.jpg")
                .selectSate("NCR")
                .selectCity("Delhi")
                .submit()
        ;

    }

    @Test
    public void registerNewStudentWithChooseDateTest() {
        new PracticeFormPage(driver)
                .enterPersonalData("Mickey","Rourke","nmail@mail.com","9874563210")
                .selectGender("Male")
                .choseDate("August", "1987", "16")
         //       .enterDate("16 Aug 1987")
                .selectSubjects(new String[]{"Maths","English","Chemistry"})
                .selectHobbyes(new String[]{"Sports","Music"})
                .uploadFile("/home/timur/Документы/1688_card.jpg")
                .selectSate("NCR")
                .selectCity("Delhi")
                .submit()
        ;

    }
}
