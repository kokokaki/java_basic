import java.util.Arrays;
import java.util.Scanner;

public class Test2 {

    static Scanner sc = new Scanner(System.in);
    // 임시 더미 자료들
    static String[] teacherID = {"aa"};
    static String[] teacherPW = {"bb"};
    static String[] teacher = {"담임"};

    static String[] studentID = {"a1", "b1", "c1"};
    static String[] studentPW = {"a1", "b1", "c1"};
    static String[] student = {"출석번호01", "출석번호02", "출석번호03"};

    static int idcnt = 0;

    static String[] loginUser = {}; // global 용

    static int[] scoreKor = {100, 95, 80};
    static int[] scoreEng = {85, 90, 90};
    static int[] scoreMat = {90, 100, 70};
    static int scoreTotal;
    static double scoreAvg;
    static int grade;

    /*
    로그인
    => 선생님이라면 관리자 페이지로
    <선생님 회원가입할때 선생님 학생 선택항목>

    선생님만 관리자
     */

    // 프로그램 메인
    static void main() {
        /*
        System.out.println(Arrays.toString(teacherID));
        System.out.println(Arrays.toString(teacherPW));
        System.out.println(Arrays.toString(teacher));
        System.out.println(Arrays.toString(studentID));
        System.out.println(Arrays.toString(studentPW));
        System.out.println(Arrays.toString(student));
         */
        while (true) {
            System.out.println("==============================");
            System.out.println("\t [[ 아이섹 초등학교 ]]");
            System.out.println("\t[[ 성적 관리 프로그램 ]]");
            System.out.println("==============================");
            System.out.println("1. 로그인  | 2. 회원가입  |  3. 종료");
            System.out.print(">> ");
            int choice = sc.nextInt();
            if (choice == 1) {
                UserLogin();
                break;
            }
            if (choice == 2) {
                AddUser();
                break;
            }
            if (choice == 3) {
                exit();
            } else {
                System.out.println("다시 생각해보는게 어때?");
            }
        } // while end
    }


    // 프로그램 로그인 이후 선생님 메인
    static void teachermain() {
        System.out.println("==============================");
        System.out.println("\t [[ 아이섹 초등학교 ]]");
        System.out.println("\t[[ 성적 관리 프로그램 ]]");
        System.out.println("==============================");
        System.out.println("1. 학생성적 입력  | 2. 학생 성적 확인  |  3. 학생 성적 수정  |  4. 전체 학생 조회  |  5. 로그아웃  |  6. 종료");
    }

    // 프로그램 로그인 이후 학생 메인
    static void studentmain() {
        System.out.println("==============================");
        System.out.println("\t [[ 아이섹 초등학교 ]]");
        System.out.println("\t[[ 성적 관리 프로그램 ]]");
        System.out.println("==============================");
        System.out.println("1. 성적확인  |  2. 로그아웃  |  3. 종료");
    }

    // 로그인 함수
    public static void UserLogin() {
        while (true) {
            System.out.print("[* 아이디 : ]");
            String UserID = sc.next();
            System.out.print("[* 비밀번호 : ]");
            String UserPW = sc.next();
            int log = 0;
            for (int i = 0; i < teacher.length; i++) {
                if (teacherID[i].equals(UserID) && teacherPW[i].equals(UserPW)) {
                    log = i;
                    System.out.println(teacher[log] + "선생님이 로그인 하셨습니다.");
                    System.out.println(teacher[log] + "님 반갑습니다. (*´∀`*)");
                    String[] temp = new String[loginUser.length + 1];
                    for (int k = 0; k < loginUser.length; k++) {
                        temp[k] = loginUser[k];
                    }
                    temp[temp.length - 1] = UserID;
                    loginUser = temp;
                    teacherID = loginUser;
                    return;
                }
            }
            for (int j = 0; j < student.length; j++) {
                if (studentID[j].equals(UserID) && studentPW[j].equals(UserPW)) {
                    log = j;
                    System.out.println(student[log] + "학생이 로그인하였습니다.");
                    System.out.println(student[log] + "님 반갑습니다. (*´∀`*)");
                    String[] temp = new String[loginUser.length + 1];
                    for (int k = 0; k < loginUser.length; k++) {
                        temp[k] = loginUser[k];
                    }
                    temp[temp.length - 1] = UserID;
                    loginUser = temp;
                    studentID = loginUser;
                    return;
                }
            }
            System.out.println("아이디 또는 비밀번호가 올바르지 않습니다.");
        }
    }


    // 로그아웃 함수
    static void UserLogout() {
        System.out.print("[* 아이디: ]");
        String id = sc.next();
        System.out.print("[* 비밀번호: ]");
        String pw = sc.next();
        int log;
        for (int i = 0; i < idcnt; i++) {
            if (teacherID[i].equals(id) && teacherPW[i].equals(pw)) {
                log = i;
                clear();
                System.out.println(teacher[log] + "님이 로그아웃 하셨습니다.(｡•́︿•̀｡) ");
            }
        }
        main();
    }


    // 회원가입 함수
    static void AddUser() {
        System.out.println("회원가입을 부탁드리겠습니다.");
        if (whois()) {
            System.out.print("ID를 입력해주세요 : ");
            teachinsertID(sc.next());
            System.out.print("PW를 입력해주세요 : ");
            teachinsertPW(sc.next());
            System.out.print("NAME을 입력해주세요 : ");
            teachinsertNAME(sc.next());
            main();
        }
        else if (!whois()) {
            System.out.print("ID를 입력해주세요 : ");
            studentinsertID(sc.next());
            System.out.print("PW를 입력해주세요 : ");
            studentinsertPW(sc.next());
            System.out.print("NAME을 입력해주세요 : ");
            studentinsertNAME(sc.next());
            main();
        }
    } // AddUser end


    // 회원가입시 선생님 학생 선택
    static boolean whois() {
        int index = -1;
        System.out.println("선생님 과 학생 당신의 선택은?!?!?");
        System.out.println("=================================");
        System.out.println("1. 선생님  |  2. 학생  |  3. HOME");
        int choice = sc.nextInt();

        while (true) {
            if (choice == 1) {
                System.out.println("당신은 선생님이 확실합니까?");
                System.out.println("1. YES  |  2. NO");
                String nugu = sc.next();

                switch (nugu) {
                    case "1":
                        System.out.println("선생님으로서 항상 최선을 다해주세요 !!");
                        return true;
                    case "2":
                        System.out.println("구라 치다 걸리면 알죠??");
                }
            } // if end
            else if (choice == 2) {
                System.out.println("당신은 학생이 확실합니까?");
                System.out.println("1. YES  |  2. NO");
                String nugu = sc.next();

                switch (nugu) {
                    case "1":
                        System.out.println("공부해라 !!");
                        return false;
                    case "2":
                        System.out.println("뭔데.. 도대체 누군데..");
                }
            } // if end
            else if (choice == 3) {
                main();
            } else {
                System.out.println("버튼을 잘못 누르셨어요 ! \n어머 저도 실수로 종료를 눌렀네요 !");
                baroexit();
            }
        } // while end
    } // whois end


    // 현재 로그인 유저 초기화 함수
    static void clear() {
        loginUser = new String[0];

    }

    // 선생 ID 삽입 함수
    static void teachinsertID(String AddteacherID) {
        String[] temp = new String[teacherID.length + 1];
        while (true) {
            for (int a = 0; a < idcnt; a++) {
                if (teacherID[a].equals(AddteacherID)) {
                    System.out.println("사용중인 아이디입니다. 다른 아이디를 입력해주세요.");
                    return;
                }
            }
            break;
        }
        for (int i = 0; i < teacherID.length; i++) {
            temp[i] = teacherID[i];
        }
        temp[temp.length - 1] = AddteacherID;
        teacherID = temp;
    }

    // 선생 PW 삽입 함수
    static void teachinsertPW(String AddteacherPW) {
        String[] temp = new String[teacherPW.length + 1];
        for (int i = 0; i < teacherPW.length; i++) {
            temp[i] = teacherPW[i];
        }
        temp[temp.length - 1] = AddteacherPW;
        teacherPW = temp;

    }

    // 선생 이름 삽입 함수
    static void teachinsertNAME(String Addteacher) {
        String[] temp = new String[teacher.length + 1];
        for (int i = 0; i < teacher.length; i++) {
            temp[i] = teacher[i];
        }
        temp[temp.length - 1] = Addteacher;
        teacher = temp;
        idcnt += 1;
    }

    // 학생 아이디 삽입 함수
    static void studentinsertID(String AddstudentID) {
        String[] temp = new String[studentID.length + 1];
        while (true) {
            for (int a = 0; a < idcnt; a++) {
                if (studentID[a].equals(AddstudentID)) {
                    System.out.println("사용중인 아이디입니다. 다른 아이디를 입력해주세요.");
                }
            }
            break;
        }
        for (int i = 0; i < studentID.length; i++) {
            temp[i] = studentID[i];
        }
        temp[temp.length - 1] = AddstudentID;
        studentID = temp;

    }

    // 학생 비번 삽입 함수
    static void studentinsertPW(String AddstudentPW) {
        String[] temp = new String[studentPW.length + 1];
        for (int i = 0; i < studentPW.length; i++) {
            temp[i] = studentPW[i];
        }
        temp[temp.length - 1] = AddstudentPW;
        studentPW = temp;

    }

    // 학생 이름 삽입 함수
    static void studentinsertNAME(String AddstudentNAME) {
        String[] temp = new String[student.length + 1];
        for (int i = 0; i < student.length; i++) {
            temp[i] = student[i];
        }
        temp[temp.length - 1] = AddstudentNAME;
        student = temp;
    }

    // 수학함수 총괄  //
    // 점수 입력시 0 ~ 100 까지만 가능하게 하는 함수
    static int overScore(String message) {
        while (true) {
            System.out.printf(message);
            int point = sc.nextInt();
            if (point > 100 || point < 0) {
                System.out.println("점수범위는 0 ~ 100 입니다.");
                continue;
            }
            return point;
        }
    }

    // 성적입력함수 case1
    static void case1() {
        System.out.print("이름을 입력하세요 : ");
        pushName(sc.next());

        int kor = overScore("국어점수를 입력하세요 : ");
        scoreKor = pushIntArray(scoreKor, kor);

        int eng = overScore("영어점수를 입력하세요 : ");
        scoreEng = pushIntArray(scoreEng, eng);

        int math = overScore("수학점수를 입력하세요 : ");
        scoreMat = pushIntArray(scoreMat, math);

    }

    // 성적확인함수 case2
    static void case2() {
        System.out.print("성적을 확인할 학생의 이름을 입력하세요 : ");
        String checkStudentScore = sc.next();
        int index = indexOf(checkStudentScore);

        if (index != -1) {
            System.out.printf("%s의 성적을 확인합니다.\n", checkStudentScore);
            System.out.printf("국어점수 : %d\n", scoreKor[index]);
            System.out.printf("영어점수 : %d\n", scoreEng[index]);
            System.out.printf("수학점수 : %d\n", scoreMat[index]);
            scoreTotal = scoreKor[index] + scoreEng[index] + scoreMat[index];
            scoreAvg = (double) scoreTotal / 3;
            System.out.printf("총점 : %d | 평균 : %.2f\n", scoreTotal, scoreAvg);
        } else {
            System.out.printf("%s은(는) 없는 이름입니다.\n", checkStudentScore);
        }
    }

    // 성적수정함수 case3
    static void case3() {
        System.out.print("성적을 수정할 학생의 이름을 입력하세요 : ");
        String modifyStudentScore = sc.next();
        int modifyIndex = indexOf(modifyStudentScore);

        if (modifyIndex != -1) {
            System.out.println("수정할 과목을 선택하세요.");
            System.out.println("1. 국어 | 2. 영어 | 3. 수학 | 4. 전체수정");
            System.out.print(">> ");
            int modifySelect = sc.nextInt();

            if (modifySelect == 1) {
                int modKor = overScore("국어 점수를 수정합니다.\n>> ");
                scoreKor = modify(scoreKor, modifyIndex, modKor);

            } else if (modifySelect == 2) {
                int modEng = overScore("영어 점수를 수정합니다.\n>> ");
                scoreEng = modify(scoreEng, modifyIndex, modEng);

            } else if (modifySelect == 3) {
                int modMat = overScore("수학 점수를 수정합니다.\n>> ");
                scoreMat = modify(scoreMat, modifyIndex, modMat);

            } else if (modifySelect == 4) {
                System.out.println("*****모든 점수를 수정합니다.*****");
                int modKor = overScore("국어 점수를 수정합니다.\n>> ");
                scoreKor = modify(scoreKor, modifyIndex, modKor);

                int modEng = overScore("영어 점수를 수정합니다.\n>> ");
                scoreEng = modify(scoreEng, modifyIndex, modEng);

                int modMat = overScore("수학 점수를 수정합니다.\n>> ");
                scoreMat = modify(scoreMat, modifyIndex, modMat);
            } else {
                System.out.println("잘못 입력하셨습니다.");
            }
        } else {
            System.out.printf("%s은(는) 없는 이름입니다.\n", modifyStudentScore);
        }
    }

    // case4 전체 학생 점수 조회
    static void case4() {
        if (student.length > 0) {
            System.out.println("***** 모든 학생의 점수를 조회합니다 *****");

            for (int i = 0; i < student.length; i++) {
                System.out.printf("# %d, <%s>의점수\n국어 : %d점 | 영어 : %d점 | 수학 : %d점\n", i + 1, student[i], scoreKor[i], scoreEng[i], scoreMat[i]);
                scoreTotal = scoreKor[i] + scoreEng[i] + scoreMat[i];
                scoreAvg = (double) scoreTotal / 3;
                System.out.printf("총점 : %d점 | 평균 : %.2f점\n", scoreTotal, scoreAvg);

            }
        } else {
            System.out.println("등록된 데이터가 없습니다.");
        }
    }


    // studentName 배열에 새로운 데이터를 끝에 추가하는 함수
    static void pushName(String newName) {
        String[] temp = new String[student.length + 1];
        for (int i = 0; i < student.length; i++) {
            temp[i] = student[i];
        }
        temp[temp.length - 1] = newName;
        student = temp;
    }

    // 각 점수 배열에 새로운 데이터를 끝에 추가하는 함수 (int 만 가능)
    static int[] pushIntArray(int[] iArr, int newScore) {
        int[] temp = new int[iArr.length + 1];
        for (int i = 0; i < iArr.length; i++) {
            temp[i] = iArr[i];
        }
        temp[temp.length - 1] = newScore;
        return temp;
    }

    // studentName 의 인덱스 번호를 찾는 함수
    static int indexOf(String targetStudent) {
        int index = -1;
        for (int i = 0; i < student.length; i++) {
            if (targetStudent.equals(student[i])) {
                index = i;
                break;
            }
        } // end for
        return index;
    }

    // 수정할 점수의 함수
    static int[] modify(int[] iArr, int modifyIdx, int modifyScore) {
        if (modifyIdx < 0 || modifyIdx > iArr.length - 1) {
            System.out.println("인덱스 범위가 잘못됨!");
        } else {
            iArr[modifyIdx] = modifyScore;
        }
        return iArr;
    }


    // 종료 함수
    static void exit() {
        System.out.println("프로그램을 종료하시겠습니까????? Y or N");
        System.out.print(">> ");
        String naga = sc.next();

        switch (naga) {
            case "Y":
            case "y":
            case "Yes":
            case "yes":
                System.out.println("프로그램을 종료합니다.");
                System.exit(0);

            case "N":
            case "n":
            case "No":
            case "no":
                System.out.println("프로그램 종료를 취소하셨습니다.");
                break;
        }
        main(); // 종료 취소하면 메인으로 다시 돌아감
    }

    // 바로종료함수
    static void baroexit() {
        System.exit(0);
    }


    // ====================================================================================== //
    public static void main(String[] args) {


        main();
        if (loginUser == teacherID) {
            while (true) {
                teachermain();
                System.out.print("선택해주세요 >> ");
                int select = sc.nextInt();

                if (select == 1) {
                    case1();
                } else if (select == 2) {
                    case2();
                } else if (select == 3) {
                    case3();
                } else if (select == 4) {
                    case4();
                } else if (select == 5) {
                    UserLogout();
                } else if (select == 6) {
                    exit();
                } else {
                    System.out.println("다시 선택해주세요 !!");
                }

            } // while end
        } // if end

        else if (loginUser == studentID) {
            while (true) {
                studentmain();
                System.out.print("선택해주세요 >> ");
                int select = sc.nextInt();

                if (select == 1) {
                    case2();
                } else if (select == 2) {
                    UserLogout();
                } else if (select == 3) {
                    exit();
                } else {
                    System.out.println("다시 선택해주세요 !!");
                }
            } // while end
        } // if end

    } // main end
} // class end
