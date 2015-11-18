/*
*  Copyright (c) Microsoft. All rights reserved. Licensed under the MIT license. See full license at the bottom of this file.
*/
package com.microsoft.office365.msgraphsnippetapp.snippet;


import com.microsoft.office365.msgraphapiservices.MSGraphContactService;
import com.microsoft.office365.msgraphapiservices.MSGraphDrivesService;
import com.microsoft.office365.msgraphapiservices.MSGraphEventsService;
import com.microsoft.office365.msgraphapiservices.MSGraphGroupsService;
import com.microsoft.office365.msgraphapiservices.MSGraphMailService;
import com.microsoft.office365.msgraphapiservices.MSGraphMeService;
import com.microsoft.office365.msgraphapiservices.MSGraphUserService;
import com.microsoft.office365.msgraphsnippetapp.application.SnippetApp;

import static com.microsoft.office365.msgraphsnippetapp.R.string.section_contacts;
import static com.microsoft.office365.msgraphsnippetapp.R.string.section_drives;
import static com.microsoft.office365.msgraphsnippetapp.R.string.section_events;
import static com.microsoft.office365.msgraphsnippetapp.R.string.section_groups;
import static com.microsoft.office365.msgraphsnippetapp.R.string.section_me;
import static com.microsoft.office365.msgraphsnippetapp.R.string.section_messages;
import static com.microsoft.office365.msgraphsnippetapp.R.string.section_user;

public class SnippetCategory<T> {
    static final SnippetCategory<MSGraphContactService> contactSnippetCategory
            = new SnippetCategory<>(section_contacts, create(MSGraphContactService.class));

    static final SnippetCategory<MSGraphEventsService> eventsSnippetCategory
            = new SnippetCategory<>(section_events, create(MSGraphEventsService.class));

    static final SnippetCategory<MSGraphGroupsService> groupSnippetCategory
            = new SnippetCategory<>(section_groups, create(MSGraphGroupsService.class));

    static final SnippetCategory<MSGraphUserService> userSnippetCategory
            = new SnippetCategory<>(section_user, create(MSGraphUserService.class));

    static final SnippetCategory<MSGraphMailService> mailSnippetCategory
            = new SnippetCategory<>(section_messages, create(MSGraphMailService.class));

    static final SnippetCategory<MSGraphMeService> meSnippetCategory
            = new SnippetCategory<>(section_me, create(MSGraphMeService.class));

    static final SnippetCategory<MSGraphDrivesService> drivesSnippetCategory
            = new SnippetCategory<>(section_drives, create(MSGraphDrivesService.class));

    final String mSection;
    final T mService;

    SnippetCategory(int sectionId, T service) {
        mSection = SnippetApp.getApp().getString(sectionId);
        mService = service;
    }

    private static <T> T create(Class<T> clazz) {
        return SnippetApp.getApp().getRestAdapter().create(clazz);
    }
}
// *********************************************************
//
// O365-Android-Microsoft-Graph-Snippets, https://github.com/OfficeDev/O365-Android-Microsoft-Graph-Snippets
//
// Copyright (c) Microsoft Corporation
// All rights reserved.
//
// MIT License:
// Permission is hereby granted, free of charge, to any person obtaining
// a copy of this software and associated documentation files (the
// "Software"), to deal in the Software without restriction, including
// without limitation the rights to use, copy, modify, merge, publish,
// distribute, sublicense, and/or sell copies of the Software, and to
// permit persons to whom the Software is furnished to do so, subject to
// the following conditions:
//
// The above copyright notice and this permission notice shall be
// included in all copies or substantial portions of the Software.
//
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
// EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
// MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
// NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
// LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
// OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
// WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
//
// *********************************************************