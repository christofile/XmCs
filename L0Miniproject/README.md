# xmcs
XenMobile Code Smart Module L0
Project name: XM client side support case Data Parser
Definition: Develop JAVA class, which takes case data folder (.zip or unzipped version) as an input, and parse case data folder (including sub folder) files for specific operation
Objectives:
1) List all files in case data folders and subfolders with their attributes (size, date created etc.)
2) Parse Device_And_AppInfo.txt (for android) or CtxLog_AppInfo.txt (for iOS) and display basic details of case data folder ( i.e. application name and version, MDX took kit version, device model/arch info, device OS information etc)
3) Provide selection option, from which user select particular option to fetch policy specific attributes from Policy.xml/VpnConfig.xml (for android) , CtxLog_AppPolicies.xml/CtxLog_VPNConfig.xml(for iOS).i.e. Selection list
a. Get DNS specific setting --> output will be Split DNS setting and DNS suffix configured on NSGW
b. Get Tunnel specific setting --> output will be parameter value of displaying split tunnel, intranet application and ips, Network access and prefer vpn mode etc
c. Get Copy/Paste operation setting --> output will be Inbound/Outbound document exchange policy configuration (like restricted or unrescrited, allowed url scheme for inboud/outbound)
d. Get encryption setting -> enabled/disabled etc.
e. Get number of Exceptions / Errors / Warning under log files --> list all log files of diagnostics folder and displays number of Exceptions/Errors/Warnings add more selection option for bonus point 
4) Provide selection user to save console output to file for future reference. (bonus)
