"""만약 오늘 == 월요일 :
    출근한다.
만약 오늘 == 일요일 :
더 잔다."""

today = "일요일"

if today == "월요일" :  # ==같다 !=다르다
    print("출근해야지\n")  # 파이썬에서 if조건문은 그다음문장이 들여쓰기를 하지않으면 에러가 발생한다.
elif today == "수요일" : 
    print("오늘은 쉬는날~!\n")
else:
    print("무슨요일이지??\n")

if today == "일요일" :
    print("오늘은 리얼 쉬는날~!\n")


day = 30

if day < 30 :
    print("아직 돈이 없네...\n")
elif day == 30 :
    print("돈 들어오는날~~~\n")
else :
    print("무슨요일이지?\n")


pizza = False   # " "은 True ""은 False / 1이상은 true 0은 false
hamburger = True

if pizza:
    print("야호~ 피자다!!\n")
elif hamburger:
    print("와! 햄버거다~!!!\n")
else:
    print("아.. 배고파..\n")


a = True
b = True

if a and b : # or, not도있다
    print("맞네!\n")
elif b:
    print("b만 맞네~\n")