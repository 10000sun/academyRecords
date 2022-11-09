import multiprocessing
import time

class RunningHore:
    horseName = ''
    def __init__(self, name):
        self.horseName = name

    def runHorse(self) :
        for _ in range(0,3) :
            horseStr = self.horseName + '~~달립니다.\n'
            print(horseStr, end='')
            time.sleep(0.1)

if __name__ == "__main__":
    horse1 = RunningHore('@얼룩말')
    horse2 = RunningHore('#조랑말')

    mp1 = multiprocessing.Process(target=horse1.runHorse)
    mp2 = multiprocessing.Process(target=horse2.runHorse)

    mp1.start()
    mp2.start()

    mp1.join()
    mp2.join()
