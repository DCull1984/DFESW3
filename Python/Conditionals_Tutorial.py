
##Tutorial
devs_money = 100
dev_can_play_smash = False

if devs_money > 10 and dev_can_play_smash: 
    print("Dev enters samsh tournament!")
elif devs_money < 10 and dev_can_play_smash: 
    print("Dev is too poor to enter")
else: 
    print("Dev just can't play smash")

##Exercise
mark = int(input("Please enter a number between 0 - 100: "))

if mark >= 65: 
    if mark >= 85: 
        print("Distinction")
    else:
        print("Pass")
else: 
    print("Fail")