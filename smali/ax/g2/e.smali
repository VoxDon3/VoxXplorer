.class public final synthetic Lax/g2/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/Choreographer$FrameCallback;


# instance fields
.field public final synthetic c0:Landroid/content/Context;

.field public final synthetic q:Landroidx/profileinstaller/ProfileInstallerInitializer;


# direct methods
.method public synthetic constructor <init>(Landroidx/profileinstaller/ProfileInstallerInitializer;Landroid/content/Context;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/g2/e;->q:Landroidx/profileinstaller/ProfileInstallerInitializer;

    iput-object p2, p0, Lax/g2/e;->c0:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final doFrame(J)V
    .registers 5

    .line 1
    iget-object v0, p0, Lax/g2/e;->q:Landroidx/profileinstaller/ProfileInstallerInitializer;

    iget-object v1, p0, Lax/g2/e;->c0:Landroid/content/Context;

    invoke-static {v0, v1, p1, p2}, Landroidx/profileinstaller/ProfileInstallerInitializer;->e(Landroidx/profileinstaller/ProfileInstallerInitializer;Landroid/content/Context;J)V

    return-void
.end method
