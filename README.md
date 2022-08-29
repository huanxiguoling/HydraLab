![Logo](docs/images/banner-made-easy.png)
<h1 align="center">Hydra Lab</h1>
<p align="center">Build your own cloud testing infrastructure</p>

<div align="center">

[![Build Status](https://dlwteam.visualstudio.com/Next/_apis/build/status/hydra/DeviceNetworkCI?branchName=refs%2Fpull%2F32963%2Fmerge)](https://dlwteam.visualstudio.com/Next/_build/latest?definitionId=703&branchName=refs%2Fpull%2F32963%2Fmerge)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-v2.2.5-blue)
![Appium](https://img.shields.io/badge/Appium-v8.0.0-yellow)
![License](https://img.shields.io/badge/license-MIT-green)
</div>

---

- [What is Hydra Lab and what can it do?](#what-is)
- [Get Started](#get-started)
    - [Environment](#environment)
    - [For Hydra Lab User](#for-user)
    - [For Contributor](#for-contributor)
- [Update Notes](#update)
- [Contribute](#contribute)
- [References](#references)  
- [License](#license)


<span id="what-is"></span>
## What is Hydra Lab and what can it do?

Hydra Lab is a framework that can help you easily build an intelligent cloud testing platform utilizing the devices in hand.

Hydra Lab enables dev team to quickly build a self-manageable and intelligent cloud testing infrastructure. With the help of Hydra Lab, you can:

- Either: Build a new cloud testing network with Hydra Lab released packages.
- Or: Onboard your test device to an existing network with low-cost and small effort.

For more details, see [Introduction: What is Hydra Lab?](https://github.com/microsoft/HydraLab/wiki)

![Tech Architecture](docs/images/technical_architecture.png)

<span id="get-started"></span>
## Get Started

<span id="environment"></span>
### Environment

#### Supported platform for Hydra Lab agent:

|Hydra Lab agent|
|---- |
| Windows | 
| Mac OSX  |

#### Supported platform and framework for test devices:

|  | Appium | Espresso | 
| ---- |---- |---- |
|Android| &#10004; | &#10004; |
|iOS|&#10004; | x | x |
|Windows|&#10004; | x | 
|Web (Browser)|&#10004; | x | 

#### Install required packages
[Set Up PC Environment](https://github.com/microsoft/HydraLab/wiki/3.-How-to-Deploy-an-Agent#1-set-up-pc-environment)

<span id="for-user"></span>
### For Hydra Lab User:

- [Develop and Package a Test Project](https://github.com/microsoft/HydraLab/wiki/1.-Get-Started:-Develop-and-Package-a-Test-Project)
- [Run a Test Task in Hydra Lab](https://github.com/microsoft/HydraLab/wiki/2.-Get-Started:-Run-a-Test-Task-in-Hydra-Lab)
- [How to Deploy an Agent](https://github.com/microsoft/HydraLab/wiki/3.-How-to-Deploy-an-Agent)
- [How to Develop Appium Test Project](https://github.com/microsoft/HydraLab/wiki/4.-How-to-Develop-Appium-Test-Project)

<span id="for-contributor"></span>
### For Contributor:

- [How to Contribute to Hydra Lab](https://github.com/microsoft/HydraLab/wiki/5.-How-to-Contribute-to-Hydra-Lab)
- [The example Hydra Lab network front page hosted by Microsoft MaX team (AAD login required)](https://hydradevicenetwork.azurewebsites.net/portal/index.html#/)

<span id="update"></span>
## Update Notes

[Update Notes](https://github.com/microsoft/HydraLab/wiki/8.-Update-Notes)

<span id="contribute"></span>
## Contribute

We are happy to hear your ideas for the future of Hydra Lab. Check the [GitHub Issues](https://github.com/microsoft/Hydra-Lab/issues) and see if others have submitted similar issue. You can upvote existing issue or submit a new suggestion. Remember that all community interactions must abide by the [Code of Conduct](https://github.com/microsoft/Hydra-Lab/blob/main/CODE_OF_CONDUCT.md).

The Hydra Lab team encourages community feedback and contributions. Thank you for your interest in making Hydra Lab better!

![contribute](https://img.shields.io/badge/contributors-7-brightgreen)

![Contributors](docs/images/contributor.png)

<span id="contact"></span>
## Contact Us

Feel free to dive in! If you have questions about Hydra Lab, or you would like to reach out to us about an issue you're having, you can reach us as follows:
- [Open an issue](https://github.com/microsoft/HydraLab/issues) or submit PRs.
- Email us: [hydra_lab_support@microsoft.com](mailto:hydra_lab_support@microsoft.com).

<span id="references"></span>
## References

[Secure a Java web app using the Spring Boot Starter for Azure Active Directory](https://docs.microsoft.com/en-us/azure/developer/java/spring-framework/configure-spring-boot-starter-java-app-with-azure-active-directory)

<span id="license"></span>
## License

The entire codebase is under [MIT license](https://github.com/microsoft/HydraLab/blob/main/LICENSE).
