import os

child_pid = os.fork()
if not child_pid:
    os.execlp("python","python", "hello.py")
else:
    os.wait()
    print("Hello, from parent")
