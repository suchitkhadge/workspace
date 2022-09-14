package com.hr.personnel.client;

public class test1 {

  public interface Teacher {
    public void teach(String subject);
    public double gradeHW();
  }

  public class Trainer implements Teacher {
    @Override
    public void teach(String subject) {
// human in classroom, draws on whiteboard, etc.
    }
    @Override
    public double gradeHW() {
// indicate mistakes in red pen, calculate and return score
      return 0;
    }
  }

  public class OnlineTutorial implements Teacher {
    @Override
    public void teach(String subject) {
// present content slides to user via Previous, Next buttons
    }
    @Override
    public double gradeHW() {
// calculate score electronically
      return 0;
    }
  }

  public class TrainingCompany {
    // Teacher is an interface type, works just like a class type
    public void beginClass(String courseTitle, OnlineTutorial teacher) {
      teacher.teach(courseTitle);
      teacher.gradeHW();
    }
  }


}
