public class TaskCountOfEmployeesOnProject {

    public static void main(String args[]) {

        int countOfProgrammersOnProject = 3; // изменяемая переменная, количество программистов может меняться
        System.out.println("Количество программистов на проекте: " + countOfProgrammersOnProject);

        final int countOfTestersOfOneProgrammer = 2; //неизменяемая переменная (допустим есть норматив соотношения программист/тестировщик)
        System.out.println("Количество тестировщиков для тестирования кода одного программиста: " + countOfTestersOfOneProgrammer);

        final int countOfSupportSpecialistsForOneProgrammer = 4; //неизменяемая переменная (допустим есть норматив соотношения программист/поддержка)
        System.out.println("Количество специалистов поддержки на одного программиста: " + countOfSupportSpecialistsForOneProgrammer);

        //количество тестировщиков = количество программистов на проекте умножить на количество тестировщиков тестирующих код одного программиста:
        int countOfTestersOnProject = countOfProgrammersOnProject * countOfTestersOfOneProgrammer;
        System.out.println("Количество тестировщиков на проекте: " + countOfTestersOnProject);

        //количество специалистов поддержки = количество программистов на проекте умножить на количество специалистов поддержки на одного программиста
        int countOfSupportSpecialistsOnProject = countOfProgrammersOnProject * countOfSupportSpecialistsForOneProgrammer;
        System.out.println("Количество специалистов поддержки на проекте: " + countOfSupportSpecialistsOnProject);

        //общее количество технических специалистов = сложить количество программистов, тестировщиков, специалистов поддержки
        int totalCountOfTechnicalSpecialistsOnProject = countOfProgrammersOnProject + countOfTestersOnProject + countOfSupportSpecialistsOnProject;
        System.out.println("Общее количество технических специалистов на проекте: " + totalCountOfTechnicalSpecialistsOnProject);

    }
}
