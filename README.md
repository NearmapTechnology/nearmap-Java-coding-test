# nearmap-Java-coding-test
nearmap.com Java Technical Test

## Constraints

* Must be written in Java
* Must only use standard Java libraries.  No third party software.

## Task

* Create a command line tool that can calculate a red, green and blue histogram for an image and write to an output file in the format described below.
* It should be optimized for performance (e.g. multi-threaded) and should ultilize all processing cores.
* A stub main class has been provided as a starting point.
* Create a unit test to validate the results.  To simplify the process it is sufficient to include the test case in the command line tool.

## Output format

An ascii text file containing one line for each colour band in the image (in the order red, green, blue).  Each line is a comma separated list of the pixel count for each value (256 per line).

## Submission instructions

* A zip file containing the following - submitted to your agent or Nearmap contact.
  * Full source code and project files required to build.  It should compile with no errors or warnings.
  * The output histogram file for the provided sample image.
  * DO NOT include any build intermediate files in the zip file.
  * DO NOT include the provided sample image in the zip file.

* DO NOT send pull requests against this repository:  We don't want other candidates to see your solution.
