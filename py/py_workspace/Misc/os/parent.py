import os

child_path = os.path.abspath("child")

child_pid = os.fork()

if not child_pid:
    os.execlp(child_path, "child")
else:
    print("Hello from the Python parent")
    os.wait()
