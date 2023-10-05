# 2023년 하반기 소모임 - 수달
## 초기 세팅
적당한 폴더를 vsc로 열어서 아래 코드를 입력한다. <br>

`git clone https://github.com/KNU-HAEDAL/2023_Sudal_Algorithm.git` <br>
(`git init`생략하고 바로 clone만 하면 됩니다!)
<br>
vsc 프로그램에 git graph라는 확장프로그램을 설치하면 git 상황을 시각적으로 볼 수 있습니다! 

## 작업 방법
1. main 브렌치의 최신 커밋에서 자신의 브렌치를 만들고 체크아웃한다.
    - 브렌치명 형식 : `날짜_이름`, ex) `0917_gang`
2. 자기 폴더에 오늘 날짜에 해당하는 폴더를 만들고, 해당 폴더에 `README.md` 파일과 소스 코드 파일을 만든다.
3. `README.md` 파일에는 오늘 푼 문제 중 정리하고 싶은 문제를 정리하여 작성한다.
4. 소스 코드 파일에는 정리한 문제에 대한 소스 코드를 기입한다.
5. 자기 폴더의 `README.md` 파일(ex. `/김강민/README.md`)에 해당 폴더에 대한 링크를 기입한다.
    - 링크의 형식은 `[9월 17일](./0917/)` 해당 형태로 작성할 수 있다.
6. 작업이 끝나면 커밋하고, main 브렌치에 Merge한다.
    - 이때, 따로 질문할 것이 없거나 크게 공유할 것이 없으면 그냥 바로 Merge한다.
    - 만약 코드 리뷰를 받고 싶거나 공유하고 싶은게 있다면 PR을 통해 리뷰를 받고 Merge한다.
7. Merge가 끝나면 해당 작업 브렌치는 삭제한다.

## Git 사용법

1. main 브렌치의 최신 커밋에서 자신의 브렌치를 만들고 체크아웃한다.
2. main 브렌치에 체크아웃
- `git switch main`
3. 깃헙 원격 저장소에서 main 브렌치의 최신 버전을 가져옴.
- 다른 사람이 main 브렌치에 새로운 커밋을 머지했을 수 있으니!
- `git pull origin main`
4. 0917_gang 브렌치를 만들면서 체크아웃
- `git switch -c 0917_gang`

### 작업이 끝나면 커밋하고, main 브렌치에 Merge한다.
   
5. 작업했던 모든 파일들(변경사항)을 새로운 커밋(버전)의 대상으로 만들어준다.
- `git add .`
6. 새로운 커밋(버전)을 만든다. (커밋한다.)
- `git commit -m "적절한 설명을 꼭 적어주세요."`
    - ex) `git commit -m "[FEAT] 9월 17일 직사각형 만들기"`
8. main 브렌치로 체크아웃한다.
- `git switch main`
9. 0917_gang 브렌치에서 작업했던 결과물(커밋)들을 현재 브렌치(main)에 머지한다.
- `git merge 0917_gang`
10. 작업했던 결과물(커밋)들을 깃허브에 반영(푸쉬)한다.
- `git push origin main`
11. Merge가 끝나면 해당 작업 브렌치는 삭제한다.
- `git branch -D 0917_gang`

<div align=center>

## 소모임 멤버

| 김강민 | 권나예 | 구명준 | 구은성 | 김나현 |
| :---: | :---: | :---: | :---: | :---: |
| [<img src="https://github.com/dobbymin.png" width="100px">](https://github.com/dobbymin) | [<img src="https://github.com/Kwonnaye.png" width="100px">](https://github.com/Kwonnaye) | [<img src="https://github.com/Koo-EunSung.png" width="100px">](https://github.com/Koo-EunSung) | [<img src="https://github.com/999mj.png" width="100px">](https://github.com/999mj) | [<img src="https://github.com/Dansoeun.png" width="100px">](https://github.com/Dansoeun) |

| 김민주 | 박소정 | 박유정 | 박혜진 | 손성호 |
| :---: | :--: | :--: | :---: | :---: |
| [<img src="https://github.com/manjookim.png" width="100px">](https://github.com/manjookim) | [<img src="https://github.com/soParkjeong.png" width="100px">](https://github.com/soParkjeong) | [<img src="https://github.com/izoq78.png" width="100px">](https://github.com/izoq78)| [<img src="https://github.com/phj0446.png" width="100px">](https://github.com/phj0446) | [<img src="https://github.com/SungHHo.png" width="100px">](https://github.com/SungHHo) |

| 이승민 | 이재현 | 이종호 | 정여진 | 진현지 |
| :---: | :--: | :---: | :---: | :--: |
| [<img src="https://github.com/miloul.png" width="100px">](https://github.com/miloul) | [<img src="https://github.com/fanta4715.png" width="100px">](https://github.com/fanta4715) | [<img src="https://github.com/Jakelee99.png" width="100px">](https://github.com/Jakelee99) | [<img src="https://github.com/doodoo10.png" width="100px">](https://github.com/doodoo10) | [<img src="https://github.com/Catsmanager.png" width="100px">](https://github.com/Catsmanager) |

