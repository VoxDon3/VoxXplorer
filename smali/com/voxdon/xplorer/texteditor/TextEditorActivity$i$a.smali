.class Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;
.super Landroidx/recyclerview/widget/RecyclerView$F;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field public u:Landroid/widget/EditText;

.field public v:Z

.field public w:Z

.field public x:Z

.field final synthetic y:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;


# direct methods
.method public constructor <init>(Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;Landroid/view/View;)V
    .registers 5

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;->y:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$F;-><init>(Landroid/view/View;)V

    .line 4
    .line 5
    .line 6
    move-object v0, p2

    .line 7
    check-cast v0, Landroid/widget/EditText;

    .line 8
    .line 9
    iput-object v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;->u:Landroid/widget/EditText;

    .line 10
    .line 11
    invoke-static {}, Lax/X2/J;->e()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1a

    .line 16
    .line 17
    iget-object v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;->u:Landroid/widget/EditText;

    .line 18
    .line 19
    new-instance v1, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$g;

    .line 20
    .line 21
    invoke-direct {v1}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$g;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setEditableFactory(Landroid/text/Editable$Factory;)V

    .line 25
    .line 26
    .line 27
    :cond_1a
    iget-object v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;->u:Landroid/widget/EditText;

    .line 28
    .line 29
    iget-object v1, p1, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;->e:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 30
    .line 31
    invoke-static {v1}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->r0(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Landroid/view/View$OnTouchListener;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 36
    .line 37
    .line 38
    :try_start_25
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    const v0, 0x7f090001

    .line 43
    .line 44
    .line 45
    invoke-static {p2, v0}, Lax/S/h;->g(Landroid/content/Context;I)Landroid/graphics/Typeface;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    iget-object v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;->u:Landroid/widget/EditText;

    .line 50
    .line 51
    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V
    :try_end_35
    .catch Ljava/lang/Exception; {:try_start_25 .. :try_end_35} :catch_36

    .line 52
    .line 53
    .line 54
    goto :goto_4c

    .line 55
    :catch_36
    move-exception p2

    .line 56
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {v0}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    const-string v1, "FONT LOAD ERROR"

    .line 65
    .line 66
    invoke-virtual {v0, v1}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-virtual {v0, p2}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    invoke-virtual {p2}, Lax/Ha/b;->h()V

    .line 75
    .line 76
    .line 77
    :goto_4c
    invoke-static {}, Lax/X2/Q;->r()Z

    .line 78
    .line 79
    .line 80
    move-result p2

    .line 81
    if-eqz p2, :cond_5c

    .line 82
    .line 83
    iget-object p2, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;->u:Landroid/widget/EditText;

    .line 84
    .line 85
    new-instance v0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a$a;

    .line 86
    .line 87
    invoke-direct {v0, p0, p1}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a$a;-><init>(Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 91
    .line 92
    .line 93
    :cond_5c
    iget-object p2, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;->u:Landroid/widget/EditText;

    .line 94
    .line 95
    new-instance v0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a$b;

    .line 96
    .line 97
    invoke-direct {v0, p0, p1}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a$b;-><init>(Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p2, v0}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    .line 101
    .line 102
    .line 103
    iget-object p2, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;->u:Landroid/widget/EditText;

    .line 104
    .line 105
    new-instance v0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a$c;

    .line 106
    .line 107
    invoke-direct {v0, p0, p1}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a$c;-><init>(Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p2, v0}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 111
    .line 112
    .line 113
    return-void
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
.end method


# virtual methods
.method public N(I)V
    .registers 5

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;->v:Z

    .line 3
    .line 4
    iput-boolean v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;->w:Z

    .line 5
    .line 6
    iget-boolean v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;->x:Z

    .line 7
    .line 8
    iget-object v1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;->u:Landroid/widget/EditText;

    .line 9
    .line 10
    iget-object v2, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;->y:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;

    .line 11
    .line 12
    invoke-static {v2}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;->N(Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;)Ljava/util/ArrayList;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$j;

    .line 21
    .line 22
    iget-object p1, p1, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$j;->a:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setTextKeepState(Ljava/lang/CharSequence;)V

    .line 25
    .line 26
    .line 27
    if-nez v0, :cond_25

    .line 28
    .line 29
    iget-object p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;->u:Landroid/widget/EditText;

    .line 30
    .line 31
    invoke-virtual {p1}, Landroid/widget/TextView;->length()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setSelection(I)V

    .line 36
    .line 37
    .line 38
    :cond_25
    const/4 p1, 0x0

    .line 39
    iput-boolean p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;->w:Z

    .line 40
    .line 41
    return-void
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method public O(F)V
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;->u:Landroid/widget/EditText;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method
