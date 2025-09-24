
SAST Demo Eclipse Workspace
===========================

What this package contains
- A simple Maven Java project (com.example.sastdemo) with three intentionally vulnerable classes:
  1. UserController.java         -> SQL injection via string concatenation
  2. DatabaseConfig.java        -> Hardcoded credentials in source
  3. SessionManager.java        -> Uses java.util.Random for session IDs (weak RNG)

Purpose
- Use this project to demonstrate SpotBugs findings in Eclipse and to practice triage & CVSS scoring.
- **Important:** This code is intentionally vulnerable for educational purposes. Only run and scan in an isolated lab or local dev environment. Never target production systems.

How to import into Eclipse
1. Install Maven support (M2E) and SpotBugs Eclipse plugin (Help → Eclipse Marketplace → "SpotBugs").
2. File → Import → Existing Maven Projects → select the folder 'sast-eclipse-demo'.
3. Once imported, build the project (Maven → Update Project).
4. Run SpotBugs in Eclipse (Right-click project → SpotBugs → Find Bugs) or use the SpotBugs view to inspect findings.

Files
- pom.xml
- src/main/java/com/example/sastdemo/UserController.java
- src/main/java/com/example/sastdemo/DatabaseConfig.java
- src/main/java/com/example/sastdemo/SessionManager.java
- src/main/java/com/example/sastdemo/MainApp.java
- docs/SAST_triage_template.csv  (example triage CSV you can import into Excel)

Safety note
- Do not attempt to exploit vulnerabilities against any external or production targets.
- Use this code only for local demos and training.
