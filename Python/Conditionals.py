nameVar1 = "David"
listOfAnimals = ['sheep', 'cat', 'tree frog', 'carp']
varForADictionary = {'name':'David', 'size':'5 foot 10 inches', 'age':'36'}

if "Steve" == nameVar1:
    print("sup Steve")

if 'cat' in listOfAnimals:
    print("theres a cat here")
elif 'carp' in listOfAnimals: 
    print("theres a fish, blub blub blub")
elif 'sheep' in listOfAnimals:
    print("sheeps available, get the mint sauce")
elif 'ghost' in listOfAnimals: 
    print("nothing here spooky")
else: 
    ("error, nothing found")


if 'David' in varForADictionary.values():
    print('David is in the list')

print("will always print")