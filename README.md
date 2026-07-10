# Aganora Chat

**A fork of [SimpleX Chat](https://github.com/simplex-chat/simplex-chat) -- the first messaging platform operating without user identifiers of any kind -- 100% private by design!**

[![build](https://github.com/amaulana8/aganora-chat/actions/workflows/build-apk.yml/badge.svg?branch=stable)](https://github.com/amaulana8/aganora-chat/actions/workflows/build-apk.yml)

---

## What is Aganora Chat?

Aganora Chat is a mobile messaging app built on the **SimpleX network protocol**. Like SimpleX Chat, it has no user identifiers -- not even random numbers -- making it the most private messaging platform available.

This project is a **fork** of [SimpleX Chat](https://github.com/simplex-chat/simplex-chat) maintained by [amaulana8](https://github.com/amaulana8).

## What's different?

Compared to upstream SimpleX Chat, Aganora Chat includes:

- **Rebranded UI**: Custom app icons, logos, and color theme
- **Package renamed**: From `chat.simplex.app` to `com.aganorachat.app`
- **Android-only build**: Focused on Android APK builds (arm64-v8a)

All core messaging features, privacy, and security are identical to SimpleX Chat.

## Installation (Android)

Download the latest APK from [GitHub Actions](https://github.com/amaulana8/aganora-chat/actions/workflows/build-apk.yml) or [Releases](https://github.com/amaulana8/aganora-chat/releases).

Requirements: Android 8.0+ (API 26), arm64-v8a.

## Features

- **No user identifiers**: No phone numbers, emails, or usernames
- **End-to-end encryption**: Double ratchet protocol with post-quantum key exchange
- **Private message routing**: Conceals IP addresses from recipients
- **Audio and video calls**: End-to-end encrypted WebRTC calls
- **Groups and communities**: With privacy-preserving moderation
- **File sharing via XFTP**: Efficient, private large file transfers
- **Disappearing messages**: With recipient opt-in per contact
- **Multiple profiles**: Separate identities in one app
- **Tor support**: Optional routing via Tor

For full details about SimpleX network features, see the [upstream documentation](https://github.com/simplex-chat/simplex-chat).

---

## License

This software is licensed under the **GNU Affero General Public License version 3 (AGPLv3)**. See the [LICENSE](./LICENSE) file for details.

This is a **modified version** of SimpleX Chat. The original copyright and license terms apply to all code from the upstream project.

Modifications made:
- Changed app package name from `chat.simplex.app` to `com.aganorachat.app`
- Replaced all app icons, logos, and branding assets
- Removed duplicate CI pipeline
- Fixed Android manifest class references for rebranded package
- Limited build targets to Android arm64-v8a

The SimpleX Chat name, logo, and associated branding materials remain trademarks of SimpleX Chat Ltd. This fork is not endorsed by or affiliated with SimpleX Chat Ltd.
